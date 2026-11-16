public class QueueUsingArrayDemo {

    public static void main(String[] args) {

        String[] students = {
            "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
            "Elif", "Mustafa", "Fatma", "Can", "Ece",
            "Burak", "Deniz", "Emre", "Selin", "Mert",
            "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        Queue<String> queue = new Queue<>(10);

        // Insert first 10 students
        for (int i = 0; i < 10; i++) {
            queue.enqueue(students[i]);
        }

        // Display original queue
        System.out.println("Original Queue: " + queue);

        // Display queue size
        System.out.println("Queue Size: " + queue.size());

        // Display first student
        System.out.println("First Student: " + queue.peek());

        // Remove three students
        System.out.println("\nRemoving three students:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Removed: " + queue.dequeue());
        }

        // Display remaining queue
        System.out.println("\nQueue After Removal: " + queue);

        // Display final size
        System.out.println("Final Queue Size: " + queue.size());

        // Try to add the 11th student
        System.out.println("\nTrying to add the 11th student:");

        queue.enqueue(students[10]);

        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue After Adding Burak: " + queue);
    }
}