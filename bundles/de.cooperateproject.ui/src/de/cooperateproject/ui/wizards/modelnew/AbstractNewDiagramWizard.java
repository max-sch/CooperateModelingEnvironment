package de.cooperateproject.ui.wizards.modelnew;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.ui.modelcreator.ModelCreator;
import de.cooperateproject.ui.wizards.modelnew.impl.ModelAndDiagramSelectionPage;
import de.cooperateproject.ui.wizards.modelnew.impl.SelectedNamesDTO;

public abstract class AbstractNewDiagramWizard extends Wizard implements INewWizard {

    private IStructuredSelection selection;
    private SelectedNamesDTO selectedNames;
    private IDiagramType diagramType;

    public AbstractNewDiagramWizard(IDiagramType diagramType) {
        super();
        this.diagramType = diagramType;
        setWindowTitle("New " + diagramType.getName() + " Diagram");
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.selection = selection;
    }

    @Override
    public void addPages() {
        super.addPages();
        ModelAndDiagramSelectionPage page = new ModelAndDiagramSelectionPage(selection);
        selectedNames = page.getDTO();
        addPage(page);
    }

    @Override
    public boolean performFinish() {
        IProject project = selectedNames.getSelectedProjectName().getProject();
        String modelName = selectedNames.getSelectedModelName();
        String diagramName = selectedNames.getSelectedDiagramName();

        IStatus status = ModelCreator.createDiagram(project, modelName, diagramName, diagramType);
        return status.getSeverity() == IStatus.OK;
    }

}
