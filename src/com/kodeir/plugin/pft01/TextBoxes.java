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

    // You can omit this constructor when registering the action in the plugin.xml file.
    public TextBoxes(){
        // defining menu item name
        super("Text __Boxxes",
                "dummy description",
                IconLoader.getIcon("/icons/crash_test_dummy.png"));
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = anActionEvent.getData(PlatformDataKeys.PROJECT);
        String txt= Messages.showInputDialog(project,
                "Dummy message",
                "Dummy title",
                Messages.getQuestionIcon());
        Messages.showMessageDialog(project,
                "Hello, " + txt + "!\n I am glad to see you.",
                "Dummy Information",
                Messages.getInformationIcon());
    }
}
