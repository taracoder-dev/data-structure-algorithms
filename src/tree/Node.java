package tree;

import java.util.ArrayList;
import java.util.List;

public class Node {

    int data;
    List<Node> children;
    Node(int x){
        data = x;
        children = new ArrayList<>();
    }

}
