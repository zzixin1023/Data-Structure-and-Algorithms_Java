package avl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import avl.AVLTree;
import avl.TreeNode;

import org.junit.Rule;
import org.junit.Test;

import avl.util.TreeToStrings;
import avl.validate.BSTValidator;

public class TestSmall {

	@Test
	public void testLeftLeft() {
		AVLTree<Integer> tree = new AVLTree<>();
		// Perform insertions
		/** Expected tree after insertions:
		*			5					3
		*		   /				   / \
		*		  3			-> 		  1   5 
		*		 /
		*		1
		*/	
		tree.insert(5);
		tree.insert(3);
		tree.insert(1);
		
		// check size
		assertEquals(3, tree.size);
		
		// check value of root
		// NOTE: we need to use method intValue because root.value is an Integer object
		//		and assertEquals has to compare 3 (an int) with another int
		TreeNode<Integer> root = tree.getRoot();
		assertEquals(3, root.value.intValue());	
		
		// check left child
		assertNotNull("Expected a left child but there is none", root.left);
		assertEquals(1, root.left.value.intValue());
		
		// check right child
		assertNotNull("Expected a right child but there is none", root.right);
		assertEquals(5, root.right.value.intValue());
	}
	
	@Test
	public void yourTest1() {
		fail("Not yet implemented");
	}
	
	@Test
	public void yourTest2() {
		fail("Not yet implemented");
	}
	
	@Test
	public void yourTest3() {
		fail("Not yet implemented");
	}

}
