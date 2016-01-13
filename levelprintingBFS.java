/* Print out all the nodes of a tree in level order. 
	1
  2  3
 4 5   6
 ..should print out

 1
 23
 456


 Answer: The traditional BFS algorithm would just print out "123456". The trick to this question is to know when to create a new line, by keeping track of when each level starts.
 One way to do this would be to use two queues to track the current and next level.

 */

public void printTree(TreeNode root){
	Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
	Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
	currentLevel.add(root);
	
	while(!currentLevel.isEmpty()){
		Iterator<TreeNode> iter = currentLevel.iterator();
		while (iter.hasNext()) {
			TreeNode currentNode = iter.next();
			if (current.left != null){
				nextLevel.add(currentNode.left);
			}
			if (current.right != null){
				nextLevel.add(currentNode.right);
			}
			System.out.println(currentNode.value + " ")
		}
		System.out.println();
		currentLevel = nextLevel;
		nextLevel = new LinkedList <TreeNode>();
	}

}
 