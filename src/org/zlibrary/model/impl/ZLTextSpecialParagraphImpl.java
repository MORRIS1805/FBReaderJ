package org.zlibrary.model.impl;

class ZLTextSpecialParagraphImpl extends ZLTextParagraphImpl {
	private Kind myKind;

	ZLTextSpecialParagraphImpl(Kind kind) {
		myKind = kind;
	}

	public Kind getKind() {
		return myKind;
	}
}
