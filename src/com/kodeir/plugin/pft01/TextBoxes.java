package com.kodeir.plugin.pft01;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.IconLoader;

/**
 * Created by Sergei "Kodeir" Riabinin on 10/03/17.
 */
public class TextBoxes extends AnAction{

    /*
    // constructor is omitted as the action is now registered in the plugin.xml file.
    public TextBoxes(){
        // defining menu item name
        super("Text __Boxxes",
                "dummy description",
                IconLoader.getIcon("/icons/crash_test_dummy.png"));
    }
    */

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = anActionEvent.getData(PlatformDataKeys.PROJECT);
        String inputTxt= Messages.showInputDialog(project,
                "Dummy message",
                "Dummy title",
                Messages.getQuestionIcon());
        // Cancel on showInputDialog -> inputTxt == null
        if (inputTxt!=null) {
            Messages.showMessageDialog(project,
                    "Hello, " + inputTxt + "!\n I am glad to see you.",
                    "Dummy Information",
                    Messages.getInformationIcon());
        }
    }
}
