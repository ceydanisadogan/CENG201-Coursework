# Exercise 1 - Analysis

## 1. Current page after each operation

| Operation | Current page |
|---|---|
| Initial state | None (`null`) |
| Visit Google | google.com |
| Visit YouTube | youtube.com |
| Go back | google.com |
| Visit Facebook | Facebook.com |
| Go back | google.com |
| Go forward | Facebook.com |
| Visit StackOverflow | stackoverflow.com |

## 2. What happens to the forward stack when a new page is visited?

The forward stack is cleared. Visiting a new page creates a new navigation path, so the previously available forward history is no longer valid.

## 3. Why are stacks appropriate for this problem?

Browser navigation follows the Last-In, First-Out (LIFO) principle. The most recently visited previous page is the first page reached by Go Back. The forward stack similarly stores pages in the order needed for Go Forward.

## 4. Time complexity

| Method | Time complexity | Explanation |
|---|---|---|
| `push()` | O(1) | A new node is inserted at the top without traversal. |
| `pop()` | O(1) | The top node is removed by updating one reference. |
| `peek()` | O(1) | The top node is read directly. |
| `visit()` | O(n) worst case | Pushing the current page is O(1), but clearing the forward stack may pop all n nodes. |
| `goBack()` | O(1) | It performs a constant number of stack operations. |
| `goForward()` | O(1) | It performs a constant number of stack operations. |
