package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> collection = new ArrayList<Integer>();
        collection.add(5);
        collection.add(7);
        collection.add(9);
        collection.set(1, 100); // source: https://stackoverflow.com/questions/7452772/java-arraylist-replace-at-specific-index

        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.offer("Yellow");
        queue.offer("Blue");
        queue.offer("Black");
        queue.offer("Red");

        Iterator<String> iterator1 = queue.iterator();
        while (iterator1.hasNext()) { //source: https://stackoverflow.com/questions/13758640/how-should-i-iterate-a-priority-queue-properly
            System.out.println(iterator1.next());
        }
        String input = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a color to add it to the PriorityQueue");
        queue.offer(scan.nextLine());

        Iterator<String> iterator2 = queue.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        boolean flag = false;
        Iterator<String> iterator3 = queue.iterator();
        while (iterator3.hasNext()) {
            if (iterator3.next().equals("Orange")) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("'Orange' element is in the PriorityQueue ");
        } else
            System.out.println("'Orange' element is not in the PriorityQueue ");

    }
}
