package com.example.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by nigel on 2022/8/24.
 *
 * @author nigel
 */
public class SimpleQueue implements Queue {
  private Object[] array = new Object[10];
  private int size = 0;

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public Object[] toArray(Object[] a) {
    return new Object[0];
  }

  @Override
  public boolean add(Object o) {
    if (size == 10) {
      throw new QueueFullException();
    }
    array[size] = o;
    size++;
    return false;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public boolean retainAll(Collection c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection c) {
    return false;
  }

  @Override
  public boolean containsAll(Collection c) {
    return false;
  }

  @Override
  public boolean offer(Object o) {
    return false;
  }

  @Override
  public Object remove() {
    return null;
  }

  @Override
  public Object poll() {
    return null;
  }

  @Override
  public Object element() {
    return null;
  }

  @Override
  public Object peek() {
    Object o = null;
    for (int i = 0; i < 10; i++) {
      if (array[i] != null) {
        o = array[i];
        array[i] = null;
        size--;
        break;
      }
    }
    return o;
  }
}
