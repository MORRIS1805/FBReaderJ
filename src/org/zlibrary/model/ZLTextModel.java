package org.zlibrary.model;

public interface ZLTextModel {
    
    int getParagraphsNumber();
    ZLTextParagraph getParagraph(int index);

    void addParagraphInternal(ZLTextParagraph paragraph);
    void removeParagraphInternal(int index);

    void addControl(byte textKind, boolean isStart);
    void addText(String text);
    void addText(StringBuffer text);


	//void addControl(ZLTextForcedControlEntryImpl entry);
	void addHyperlinkControl(byte textKind, String label);
	//void addImage(String id, ZLImageMap imageMap, short vOffset);
	void addFixedHSpace(byte length);

    String dump();    
}
