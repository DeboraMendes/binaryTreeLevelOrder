package br.com.binaryTreeLevelOrder;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BinaryTreeTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void test1() {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        one.setRight(two);

        two.setRight(five);

        five.setRight(six);
        five.setLeft(three);

        three.setRight(four);

        BinaryTree.levelOrder(one);

        assertEquals("1 2 5 3 6 4", systemOutRule.getLog().trim());

    }

    @Test
    public void test2() {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.setRight(three);
        one.setLeft(two);

        two.setRight(five);
        two.setLeft(four);

        BinaryTree.levelOrder(one);

        assertEquals("1 2 3 4 5", systemOutRule.getLog().trim());

    }

}
