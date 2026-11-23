# Exercise 2 - Analysis

**Time complexity: O(n)**

Each recursive call swaps two elements and moves the left index one position forward and the right index one position backward. The method performs approximately n/2 calls, which is O(n).

**Auxiliary space complexity: O(n)** because the recursive calls use the call stack (more precisely, O(n/2), which is O(n)).
