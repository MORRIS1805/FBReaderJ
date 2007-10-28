package org.zlibrary.model.impl;

import org.zlibrary.model.ZLTextTreeModel;
import org.zlibrary.model.ZLTextTreeParagraph;

public class ZLTextTreeModelImpl extends ZLTextModelImpl implements ZLTextTreeModel {
	private ZLTextTreeParagraph myRoot;
	
	public ZLTextTreeModelImpl() {
		myRoot = new ZLTextTreeParagraphImpl();
		myRoot.open(true);
	}
	
	public ZLTextTreeParagraph createParagraph(ZLTextTreeParagraph parent) {
		if (parent == null) {
			parent = myRoot;
		}
		ZLTextTreeParagraph tp = new ZLTextTreeParagraphImpl(parent);
		addParagraphInternal(tp);
		return tp;
	}
	
	public void removeParagraph(int index) {
		ZLTextTreeParagraph p = (ZLTextTreeParagraph)this.getParagraph(index);
		p.removeFromParent();
		this.removeParagraphInternal(index);
	}
}
