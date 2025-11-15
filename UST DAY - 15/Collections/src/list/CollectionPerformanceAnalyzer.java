package list;

public class CollectionPerformanceAnalyzer {
	public static void main(String[] args) {
		import java.util.*;

		public class CollectionPerformanceAnalyzer {
		    private static final int NUM_ELEMENTS = 100_000;

		    public static void main(String[] args) {
		        System.out.println("==== List Performance Comparison ====");
		        listPerformanceComparison();

		        System.out.println("\n==== Set Performance Comparison ====");
		        setPerformanceComparison();

		        System.out.println("\n==== Analysis and Conclusion ====");
		        printAnalysis();
		    }

		    private static void listPerformanceComparison() {
		        System.out.println("\nArrayList:");
		        List<Integer> arrayList = new ArrayList<>();
		        // Add elements
		        long start = System.nanoTime();
		        for (int i = 0; i < NUM_ELEMENTS; i++) arrayList.add(i);
		        long elapsed = System.nanoTime() - start;
		        System.out.printf("Add %d elements: %.3f ms\n", NUM_ELEMENTS, elapsed / 1_000_000.0);

		        // Search present
		        start = System.nanoTime();
		        boolean found = arrayList.contains(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for present element: %.3f ms\n", elapsed / 1_000_000.0);

		        // Search absent
		        start = System.nanoTime();
		        found = arrayList.contains(NUM_ELEMENTS + 1);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for absent element: %.3f ms\n", elapsed / 1_000_000.0);

		        // Access elements
		        start = System.nanoTime();
		        arrayList.get(0);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Access first element: %.6f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        arrayList.get(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Access middle element: %.6f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        arrayList.get(NUM_ELEMENTS - 1);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Access last element: %.6f ms\n", elapsed / 1_000_000.0);

		        // Remove elements (reload list before each)
		        List<Integer> tempList = new ArrayList<>();
		        for (int i = 0; i < NUM_ELEMENTS; i++) tempList.add(i);

		        start = System.nanoTime();
		        tempList.remove(0);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Remove first element: %.3f ms\n", elapsed / 1_000_000.0);

		        tempList.clear();
		        for (int i = 0; i < NUM_ELEMENTS; i++) tempList.add(i);
		        start = System.nanoTime();
		        tempList.remove(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Remove middle element: %.3f ms\n", elapsed / 1_000_000.0);

		        tempList.clear();
		        for (int i = 0; i < NUM_ELEMENTS; i++) tempList.add(i);
		        start = System.nanoTime();
		        tempList.remove(NUM_ELEMENTS - 1);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Remove last element: %.3f ms\n", elapsed / 1_000_000.0);

		        // Repeat for LinkedList
		        System.out.println("\nLinkedList:");
		        List<Integer> linkedList = new LinkedList<>();
		        start = System.nanoTime();
		        for (int i = 0; i < NUM_ELEMENTS; i++) linkedList.add(i);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Add %d elements: %.3f ms\n", NUM_ELEMENTS, elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        found = linkedList.contains(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for present element: %.3f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        found = linkedList.contains(NUM_ELEMENTS + 1);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for absent element: %.3f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        linkedList.get(0);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Access first element: %.3f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        linkedList.get(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Access middle element: %.3f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        linkedList.get(NUM_ELEMENTS - 1);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Access last element: %.3f ms\n", elapsed / 1_000_000.0);

		        linkedList.clear();
		        for (int i = 0; i < NUM_ELEMENTS; i++) linkedList.add(i);
		        start = System.nanoTime();
		        linkedList.remove(0);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Remove first element: %.3f ms\n", elapsed / 1_000_000.0);

		        linkedList.clear();
		        for (int i = 0; i < NUM_ELEMENTS; i++) linkedList.add(i);
		        start = System.nanoTime();
		        linkedList.remove(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Remove middle element: %.3f ms\n", elapsed / 1_000_000.0);

		        linkedList.clear();
		        for (int i = 0; i < NUM_ELEMENTS; i++) linkedList.add(i);
		        start = System.nanoTime();
		        linkedList.remove(NUM_ELEMENTS - 1);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Remove last element: %.3f ms\n", elapsed / 1_000_000.0);
		    }

		    private static void setPerformanceComparison() {
		        System.out.println("\nHashSet:");
		        Set<Integer> hashSet = new HashSet<>();
		        long start = System.nanoTime();
		        for (int i = 0; i < NUM_ELEMENTS; i++) hashSet.add(i);
		        long elapsed = System.nanoTime() - start;
		        System.out.printf("Add %d elements: %.3f ms\n", NUM_ELEMENTS, elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        boolean found = hashSet.contains(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for present element: %.6f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        found = hashSet.contains(NUM_ELEMENTS + 1);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for absent element: %.6f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        hashSet.remove(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Remove element: %.6f ms\n", elapsed / 1_000_000.0);

		        System.out.println("\nLinkedHashSet:");
		        Set<Integer> linkedHashSet = new LinkedHashSet<>();
		        start = System.nanoTime();
		        for (int i = 0; i < NUM_ELEMENTS; i++) linkedHashSet.add(i);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Add %d elements: %.3f ms\n", NUM_ELEMENTS, elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        found = linkedHashSet.contains(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for present element: %.6f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        found = linkedHashSet.contains(NUM_ELEMENTS + 1);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for absent element: %.6f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        linkedHashSet.remove(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Remove element: %.6f ms\n", elapsed / 1_000_000.0);

		        System.out.println("\nTreeSet:");
		        Set<Integer> treeSet = new TreeSet<>();
		        start = System.nanoTime();
		        for (int i = 0; i < NUM_ELEMENTS; i++) treeSet.add(i);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Add %d elements: %.3f ms\n", NUM_ELEMENTS, elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        found = treeSet.contains(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for present element: %.6f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        found = treeSet.contains(NUM_ELEMENTS + 1);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Search for absent element: %.6f ms\n", elapsed / 1_000_000.0);

		        start = System.nanoTime();
		        treeSet.remove(NUM_ELEMENTS / 2);
		        elapsed = System.nanoTime() - start;
		        System.out.printf("Remove element: %.6f ms\n", elapsed / 1_000_000.0);
		    }

		    private static void printAnalysis() {
		        System.out.println(
		            "List Performance Analysis:\n" +
		            "- ArrayList:\n" +
		            "  * Adds at end are fast (amortized O(1)) due to dynamic array resizing.\n" +
		            "  * Access by index is very fast (O(1)) due to direct array access.\n" +
		            "  * Searches via contains() are O(n), but benefit from locality of reference.\n" +
		            "  * Removing elements except last is slow (O(n)) due to element shifting.\n" +

		            "- LinkedList:\n" +
		            "  * Adds are fast at ends (O(1)), slower if not at ends.\n" +
		            "  * Access by index is slow (O(n)) as it must traverse nodes.\n" +
		            "  * Searches are O(n) by traversal.\n" +
		            "  * Removal of known nodes is fast (O(1)), but removal by index requires traversal (O(n)).\n\n" +

		            "Set Performance Analysis:\n" +
		            "- HashSet:\n" +
		            "  * Uses hash table, offering O(1) average case for add, search, and remove.\n" +
		            "  * Does not maintain order.\n" +

		            "- LinkedHashSet:\n" +
		            "  * Same performance as HashSet, but maintains insertion order via linked list.\n" +
		            "  * Slightly more overhead than HashSet.\n" +

		            "- TreeSet:\n" +
		            "  * Uses balanced Red-Black tree, giving O(log n) for add, search, remove.\n" +
		            "  * Maintains elements sorted.\n\n" +

		            "Summary:\n" +
		            "Use ArrayList for fast random access and appending elements.\n" +
		            "Use LinkedList when frequent insertions/removals at list ends and no need for fast indexed access.\n" +
		            "Use HashSet for fastest set operations without order.\n" +
		            "Use LinkedHashSet for predictable iteration order with good performance.\n" +
		            "Use TreeSet when sorted set is needed despite slower performance."
		        );
		    }
		}

	}
}
