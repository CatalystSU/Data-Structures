import java.util.*;

public class Main {
    public static void main(String[] args) {
//       core();
//       stringStuff();
//       arrList();
//       linkedList();
//       hashMap();
//       hashSet();

//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//        BinaryTree.preorder(root);
//        System.out.println();
//
//        BinaryTree.inorder(root);
//        System.out.println();
//
//        BinaryTree.postorder(root);
//        System.out.println();
//        BST ob=new BST();
//        ob.root=ob.insert(50,ob.root);
//        ob.root=ob.insert(30,ob.root);
//        ob.root=ob.insert(20,ob.root);
//        ob.root=ob.insert(20,ob.root);
//        ob.root=ob.insert(70,ob.root);
//        ob.root=ob.insert(60,ob.root);
//        ob.root=ob.insert(80,ob.root);
//        ob.root=ob.delete(ob.root,50);
//        System.out.println("******" +ob.root.data);
//        ob.inorder(ob.root);
//        Node find=ob.search(30,ob.root);
//        if(find==null)
//            System.out.println("not found");
//        else
//            System.out.println("found : "+find.data);
//        Graph g=new Graph(4);
//        g.addEdge(0,1);
//        g.addEdge(0,2);
//        g.addEdge(1,2);
//        g.addEdge(2,0); ???
//        g.addEdge(2,3);
//        g.addEdge(3,3); ???
//
//        g.BFS(2);
//        g.DFS(2);
    }
    public static int findSum (int num1, int num2) {
        return num1 + num2;
    }
    public static void core () {
        // Printing
        System.out.println("bruh");
        System.out.print("bruh");
        // Vars
        int num = 10;
        double dec = 4.99;
        boolean isTrue = false;
        char charac = 'A';
        String message = "hello there";
        // If
        if (isTrue) {
            System.out.println("1");
        } else if (!isTrue) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
        // For each loop
        String[] colors = {"Red", "Blue", "Yellow"};
        for (String c : colors) {
            System.out.println(c);
        }
        // Simple method
        int sum = findSum(1, 2);
        System.out.println(sum);
    }
    public static void stringStuff () {
        String test = "testing";
        test.length();
        test.concat("bruh");
        test.equals("sheesh");
        test.indexOf("t");
        test.charAt(0);
        test.substring(5, 6);

        test.toLowerCase();
        test.toUpperCase();
        test.contains("asf");
        test.equalsIgnoreCase("test");
        test.lastIndexOf("t");
        test.replace("t", "y");
        test.toCharArray();
        test.trim();
    }
    public static void arrList () {
        ArrayList<Integer> counts = new ArrayList<>();
        counts.add(1);
        counts.add(2);
        counts.add(1,4);
        counts.toString();
        counts.get(0);
        counts.remove(1);
        counts.contains(4);
        counts.size();
        counts.subList(0,2);
    }
    public static void linkedList () {
        LinkedList<String> names = new LinkedList<>();
        names.add("troy");
        names.add("matt");
        names.add(0,"jenna");
        names.get(0);
        names.remove("troy");
        names.remove(0);
    }
    public static void hashMap () {
        HashMap<String, Integer> pc = new HashMap<>();
        pc.put("ram", 8);
        pc.put("storage", 1000);
        pc.put("fans", 4);
        pc.put("dust", 5);
        pc.remove("dust");
        pc.get("storage");
        pc.size();
        pc.containsKey("fans");
        pc.containsValue(3);

        for (String key : pc.keySet()) {
            System.out.println(key);
            System.out.println(pc.get(key));
        }
    }
    public static void hashSet () {
        HashSet<String> shapes = new HashSet<>();
        shapes.add("triangle");
        shapes.add("square");
        shapes.add("circle");
        shapes.add("kite");
        shapes.remove("kite");
        shapes.contains("circle");
        shapes.size();
        shapes.clear();
    }

    public static void stack () {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.size();
        stack.empty();
        stack.peek();
        stack.search(4);
    }

    public static void queue() {
        Queue<Integer> queue = new PriorityQueue<> ();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.remove();
        queue.offer(6);
        queue.poll();
        queue.size();
    }

    static class Node {
        int data;
        Node left, right;
        Node(int d) {
            data = d;
        }
    }

    public static class BinaryTree {
        static void preorder(Node r) {
            if (r == null) {
                return;
            }
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);

        }

        static void inorder(Node r) {
            if (r == null) {
                return;
            }
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }

        static void postorder(Node r) {
            if (r == null) {
                return;
            }
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }
    public static class BST {
        Node root;
        Node insert(int d, Node root) {
            if (root == null) {
                root = new Node(d);
            } else if (d <= root.data) {
                root.left = insert(d, root.left);
            } else {
                root.right = insert(d, root.right);
            }
            return root;
        }
        Node search(int d, Node root) {
            if (root.data == d) {
                return root;
            } else if (d < root.data) {
                return search(d, root.left);
            } else {
                return search(d, root.right);
            }
        }
        void inorder(Node r) {
            if (r == null) {
                return;
            }
            inorder(r.left);
            System.out.println(r.data);
            inorder(r.right);
        }
        Node delete(Node root, int data) {
            if (root == null) {
                return root;
            }
            if (data < root.data) {
                root.left = delete(root.left, data);
            } else if (data > root.data) {
                root.right = delete(root.right, data);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                root.data = minValue(root.right);
                root.right = delete(root.right, root.data);
            }
            return root;
        }
        int minValue(Node root) {
            int minv = root.data;
            while (root.left != null) {
                minv = root.left.data;
                root = root.left;
            }
            return minv;
        }
    }

    static class Graph {
        int v;
        LinkedList<Integer> adj[];

        Graph(int v) {
            this.v = v;
            adj = new LinkedList[v];
            for (int i=0;i<v;i++) {
                adj[i] = new LinkedList<Integer>();
            }
        }

        void addEdge(int u, int v) {
            adj[u].add(v);
        }

        void BFS(int s) {
            boolean[] visited = new boolean[v];
            LinkedList<Integer> q = new LinkedList<Integer>();
            q.add(s);
            visited[s]=true;
            while(!q.isEmpty()) {
                int x=q.poll();
                System.out.print(x+" ");
                for (int p : adj[x]) {
                    if (!visited[p]) {
                        visited[p] = true;
                        q.add(p);
                    }
                }
            }
        }
        void DFSUtil(int s, boolean[] visited) {
            visited[s] = true;
            System.out.println(s);
            for (int x : adj[s]) {
                if (!visited[x]) {
                    DFSUtil(x, visited);
                }
            }
        }

        void DFS(int s){
            boolean[] visited = new boolean[v];
            DFSUtil(s, visited);
        }
    }
}

