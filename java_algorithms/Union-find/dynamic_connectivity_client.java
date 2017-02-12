public static void main(String[] args) {
  int N = StdIn.readInt(); // reads interger from the standard input.
  UF uf = new UF(N); // then from the StdIn it creates a new UF object.
  while (!StdIN.isEmpty()) { // as long is StdIn is not empty,
    int p = StdIn.readInt(); // reads two intergers from the input
    int q = StdIn.readInt();
    if (!uf.connected(p, q)) { // if they are not connected,
      uf.union(p, q); // then they will be connected
      StdOut.println(p + " " + q); // and then printed out.
    }
  }
}
