package com.kodeir.plugin.pft01;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.util.IconLoader;

/**
 * Created by Sergei "Kodeir" Riabinin on 10/03/17.
 */
public class TextBoxes extends AnAction{

    public TextBoxes(){
        // defining menu item name
        super("Text __Boxxes",
                "dummy description",
                IconLoader.getIcon("/crash_test_dummy.png"));
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {

    }
}
