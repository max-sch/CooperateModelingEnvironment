package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Attribute;

public class AttributeLabel implements SummaryItemLabelHandler{
	private final String classText = "Attribute";
	
	public String getText(EObject item){
		Attribute att = (Attribute)item;
		String type = "";
		type = ": " + att.getType().getName();
		return att.getName() + type;
	}
	
	public String getClassText(){
		return classText;
	}
	
}
