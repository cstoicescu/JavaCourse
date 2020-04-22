package Ch11.Packages.BasicWindow;

//import sun.tools.tree.Node;

public class Packages {
    public static void main(String[] args) {

//        Node node = null;

        org.w3c.dom.Node anotherNode = null;

        MyWindow myWindow = new MyWindow("Basic Window","Catalin","Stoicescu");

        myWindow.setVisible(true);
    }


}
