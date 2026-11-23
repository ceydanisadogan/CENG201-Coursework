# Homework - Data Structure Complexity Analysis

## A. Operation complexity analysis

Assumptions: the singly linked list has only a head reference; the doubly linked list has head and tail references; the stack has a top reference; and the queue has front and rear references. Stack and queue use linked nodes. For stack/queue, insert/delete at beginning/end are interpreted as structural linked-list operations; their normal operations are push/pop and enqueue/dequeue.

| Operation | Singly Linked List | Doubly Linked List | Stack | Queue |
|---|---:|---:|---:|---:|
| Insert at beginning | O(1) | O(1) | O(1) | O(1) |
| Insert at end | O(n) | O(1) | O(n) | O(1) |
| Delete from beginning | O(1) | O(1) | O(1) | O(1) |
| Delete from end | O(n) | O(1) | O(n) | O(n) |
| Access the middle element | O(n) | O(n) | O(n) | O(n) |
| Search for a value | O(n) | O(n) | O(n) | O(n) |
| Peek at first/top element | O(1) | O(1) | O(1) | O(1) |

## B. Analyze the scenarios

### Scenario 1
**Choose:** Singly linked list.

Inserting at the beginning changes the head reference and takes O(1). Deleting from the beginning also updates the head reference and takes O(1).

### Scenario 2
**Choose:** Doubly linked list.

A doubly linked list supports movement in both directions. With references to both head and tail, the previous pointer of the tail allows the last node to be deleted directly, so deletion is O(1). In a singly linked list, the node before the last node must be found by traversal, so deleting the last node is O(n).

### Scenario 3
**Choose:** Queue.

A queue follows First-In, First-Out (FIFO). A new print request is inserted at the rear in O(1), and the document at the front is removed in O(1). A stack is inappropriate because it follows Last-In, First-Out (LIFO), which would print the newest request first.

## C. Analyze the sequence

Initial list: `10 -> 20 -> 30 -> 40 -> 50 -> null` (no tail pointer).

| Operation | Time complexity | Explanation |
|---|---:|---|
| 1. Insert 5 at beginning | O(1) | Update the head reference. |
| 2. Insert 60 at end | O(n) | Traverse to the last node because there is no tail pointer. |
| 3. Delete node containing 30 | O(n) | Search for the node and its predecessor. |
| 4. Search for 40 | O(n) | In the worst case, traverse the list. |
| 5. Delete the last node | O(n) | Find the node before the last node. |
| 6. Access the middle element | O(n) | Traverse from the head to the middle. |

**b. Which operations require traversing the list?**

Operations 2, 3, 4, 5, and 6 require traversal. Operation 1 does not.

**c. How would deleting the last node change with a doubly linked list with head and tail references?**

It becomes O(1), because the tail points directly to the last node and its previous pointer identifies the new tail.

**d. If the list contains 10,000 elements instead of 5, which operations become significantly more expensive?**

The traversal-based operations (2, 3, 4, 5, and 6) become more expensive as the list grows because they are O(n). Inserting at the beginning remains O(1).
