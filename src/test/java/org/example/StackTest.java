package org.example;

import com.example.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by nigel on 2022/8/24.
 *
 * @author nigel
 */
 class StackTest {
  @Test
  void isEmptyAfterCreation(){
   Stack stack = new Stack();

   assertTrue(stack.isEmpty());
  }
}
