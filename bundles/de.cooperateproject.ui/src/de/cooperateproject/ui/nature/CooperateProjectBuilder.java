package de.cooperateproject.ui.nature;

import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import de.cooperateproject.ui.nature.tasks.BackgroundTasksAdapter;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.properties.ProjectPropertiesStore;

public class CooperateProjectBuilder extends IncrementalProjectBuilder {

	private static final Logger LOGGER = Logger.getLogger(CooperateProjectBuilder.class);
	public static final String BUILDER_ID = "de.cooperateproject.ui.CooperateProjectBuilder";
	private final Map<IProject, ProjectPropertiesDTO> oldProperties = Maps.newHashMap(); 
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		LOGGER.debug(String.format("%s started with kind %d.", CooperateProjectBuilder.class.getSimpleName(), kind));
		boolean treatAsNew = kind == CLEAN_BUILD;
		Collection<IProject> processedProjects = Lists.newArrayList();
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (project.isOpen() && NatureUtils.hasCooperateNature(project)) {
				buildProject(project, treatAsNew);
				processedProjects.add(project);
			}
		}
		return processedProjects.toArray(new IProject[0]);
	}

	private void buildProject(IProject project, boolean treatAsNew) {
		LOGGER.info(String.format("Starting build of project %s.", project.getName()));
		
		ProjectPropertiesStore propertiesStore = new ProjectPropertiesStore(project);
		propertiesStore.initFromStore();
		ProjectPropertiesDTO currentProperties = propertiesStore.getPreferences();
		
		if (treatAsNew || !currentProperties.equals(oldProperties.get(project))) {
			BackgroundTasksAdapter.getManager().deregisterProject(project);
		}
		BackgroundTasksAdapter.getManager().registerProject(project);

		oldProperties.put(project, currentProperties);
	}

}
