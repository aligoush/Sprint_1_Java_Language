package n3exercise1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Editor> editors = new ArrayList<>();
        int inputInt;
        Editor editor;
        Editor targetEditor;
        do {
            System.out.println();
            System.out.println("1) Insert editor");
            System.out.println("2) Delete editor");
            System.out.println("3) Insert the news for an editor");
            System.out.println("4) Delete news");
            System.out.println("5) All the news of an editor");
            System.out.println("6) Calculate scores of the news");
            System.out.println("7) Calculate price of the news");
            System.out.println("8) Quit");

            inputInt = InputUtils.readIntInput("Choose an option: ");
            switch (inputInt) {
                case 1:
                    String editorName = InputUtils.readInput("Enter editor's name: ");
                    String editorDNI = InputUtils.readInput("Enter editor's DNI: ");
                    editor = new Editor (editorName, editorDNI);
                    editors.add(editor);
                    System.out.println("Added editor: " + editor.getName());
                    break;
                case 2:
                    targetEditor = Main.findEditor(editors);
                    if(targetEditor != null){
                        System.out.println("Editor " + targetEditor.getName() + " is removed");
                        editors.remove(targetEditor);
                    }
                    break;
                case 3:
                    targetEditor = Main.findEditor(editors);
                    if(targetEditor!=null){
                        System.out.println("What type of news is: ");
                        System.out.println("1) Football");
                        System.out.println("2) Basketball");
                        System.out.println("3) Tennis");
                        System.out.println("4) F1");
                        System.out.println("5) Motorcycling");
                        int input = InputUtils.readIntInput("Choose an option: ");
                        targetEditor.createNews(input);
                    }
                    break;
                case 4:
                    targetEditor = Main.findEditor(editors);
                    String headline = InputUtils.readInput("Insert headline");

                    if(targetEditor!=null){
                        News newsFound= targetEditor.searchForNews(headline);
                        if(newsFound == null){
                            System.out.println("News not found");
                        } else {
                            System.out.println("News with headline \"" + newsFound.getHeadline() + "\" is removed");
                            targetEditor.getNewsList().remove(newsFound);
                        }
                    }
                    break;
                case 5:
                    targetEditor = Main.findEditor(editors);
                    if(targetEditor!=null){
                        if(!(targetEditor.getNewsList().isEmpty())){
                            targetEditor.printAllNews();
                        } else {
                            System.out.println("This editor doesn't have any news");
                        }
                    }
                    break;
                case 6:
                    targetEditor = Main.findEditor(editors);
                    headline = InputUtils.readInput("Insert headline");
                    if(targetEditor!=null){
                        News newsFound= targetEditor.searchForNews(headline);
                        if(newsFound == null){
                            System.out.println("News not found");
                        } else {
                            newsFound.getScoreNews();
                        }
                    }
                    break;
                case 7:
                    targetEditor = Main.findEditor(editors);
                    headline = InputUtils.readInput("Insert headline");
                    if(targetEditor!=null){
                        News newsFound= targetEditor.searchForNews(headline);
                        if(newsFound == null){
                            System.out.println("News not found");
                        } else {
                            newsFound.getPriceNews();
                        }
                    }
                    break;
            }
        } while (inputInt != 8);
    }
    private static Editor findEditor(ArrayList<Editor> editors){
        String editorName = InputUtils.readInput("Enter editor's name: ");
        String editorDNI = InputUtils.readInput("Enter editor's DNI: ");
        Editor editor = new Editor (editorName, editorDNI);
        Editor targetEditor = null;
        boolean editorFound = false;
        if(editors.isEmpty()){
            System.out.println("There are no editors!");
        } else {
            int i = 0;
            while (!editorFound && i < editors.size()) {
                editors.get(i);
                if(editors.get(i).equals(editor)){
                    targetEditor = editors.get(i);
                    editorFound = true;
                }
                i++;
            }
        }
        if(!editorFound){
            System.out.println("There are no such editors");
        }
        System.out.println(targetEditor);
        return targetEditor;
    }

}
