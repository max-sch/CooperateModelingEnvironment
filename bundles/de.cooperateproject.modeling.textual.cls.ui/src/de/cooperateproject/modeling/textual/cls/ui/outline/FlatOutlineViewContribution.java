package de.cooperateproject.modeling.textual.cls.ui.outline;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter.IFilter;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;

public class FlatOutlineViewContribution extends AbstractFilterOutlineContribution {

    public static final String PREFERENCE_KEY = "ui.outline.toggleOperations";

    private static final String ACTION_NAME = "Outline Hierarchy";
    private static final String ACTION_TOOLTIP = "Hierarchy/Flat";
    private static final String ACTION_DESCRIPTION = "Toggles beetween hierarchy and flat view";
    private static final String ACTION_IMAGE_URL = "platform:/plugin/org.eclipse.team.ui/icons/full/elcl16/hierarchicalLayout.gif";

    private static final Logger LOGGER = Logger.getLogger(FlatOutlineViewContribution.class);

    private TreeViewer treeViewer;
    private IFilter filter;
    private OutlineFilterAndSorter outlineFilterAndSorter;

    @Override
    public String getPreferenceKey() {
        return PREFERENCE_KEY;
    }

    @Override
    public void register(OutlinePage outlinePage) {
        super.register(outlinePage);
        outlineFilterAndSorter = outlinePage.getFilterAndSorter();
        outlineFilterAndSorter.addFilter(getFilter());
        treeViewer = outlinePage.getTreeViewer();
    }

    @Override
    public void deregister(OutlinePage outlinePage) {
        super.deregister(outlinePage);
        if (filter != null) {
            outlineFilterAndSorter.removeFilter(getFilter());
            filter = null;
        }
        outlineFilterAndSorter = null;
        treeViewer = null;
    }

    @Override
    protected void configureAction(Action action) {
        action.setText(ACTION_NAME);
        action.setToolTipText(ACTION_TOOLTIP);
        action.setDescription(ACTION_DESCRIPTION);
        action.setImageDescriptor(getImageDescriptor());
    }

    @Override
    protected void stateChanged(boolean newState) {
        if (treeViewer != null && !treeViewer.getTree().isDisposed())
            treeViewer.refresh();
    }

    @Override
    protected IFilter getFilter() {
        if (filter == null) {
            filter = new IFilter() {
                public boolean apply(IOutlineNode node) {
                    return FlatOutlineViewContribution.this.apply(node);
                }

                public boolean isEnabled() {
                    return !isPropertySet();
                }
            };
        }
        return filter;
    }

    @Override
    protected boolean apply(IOutlineNode node) {
        return !(node instanceof EStructuralFeatureNode);
    }

    private ImageDescriptor getImageDescriptor() {
        URL url = null;
        try {
            url = new URL(ACTION_IMAGE_URL);
        } catch (MalformedURLException e) {
            LOGGER.error(e.getMessage());
        }
        return ImageDescriptor.createFromURL(url);
    }

}
