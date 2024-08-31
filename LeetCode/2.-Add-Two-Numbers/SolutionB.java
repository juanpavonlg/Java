class ListNode {
  int val;
  ListNode next;

  ListNode() {
  } // ListNode()

  ListNode(int val) {
    this.val = val;
  } // ListNode()

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  } // ListNode()
} // ListNode

class SolutionB {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = null;
    ListNode tail = null;
    int carry = 0;
    while (l1 != null || l2 != null || carry > 0) {
      final int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
      carry = sum / 10;
      final ListNode node = new ListNode(sum % 10);
      if (tail != null) {
        tail.next = node;
        tail = node;
      } else {
        head = node;
        tail = node;
      }
      l1 = l1 != null ? l1.next : null;
      l2 = l2 != null ? l2.next : null;
    }
    return head;
  } // addTwoNumbers()

  public static void main(String[] args) {
    final SolutionB sol = new SolutionB();
    ListNode n13 = new ListNode(3);
    ListNode n12 = new ListNode(4, n13);
    ListNode n11 = new ListNode(2, n12);
    ListNode n23 = new ListNode(4);
    ListNode n22 = new ListNode(6, n23);
    ListNode n21 = new ListNode(5, n22);
    ListNode r = sol.addTwoNumbers(n11, n21);
    while (r != null) {
      System.out.println(r.val);
      r = r.next;
    }
    n11 = new ListNode();
    n21 = new ListNode();
    r = sol.addTwoNumbers(n11, n21);
    while (r != null) {
      System.out.println(r.val);
      r = r.next;
    }
    final ListNode n17 = new ListNode(9);
    final ListNode n16 = new ListNode(9, n17);
    final ListNode n15 = new ListNode(9, n16);
    final ListNode n14 = new ListNode(9, n15);
    n13 = new ListNode(9, n14);
    n12 = new ListNode(9, n13);
    n11 = new ListNode(9, n12);
    final ListNode n24 = new ListNode(9);
    n23 = new ListNode(9, n24);
    n22 = new ListNode(9, n23);
    n21 = new ListNode(9, n22);
    r = sol.addTwoNumbers(n11, n21);
    while (r != null) {
      System.out.println(r.val);
      r = r.next;
    }
  } // main()
} // SolutionB
