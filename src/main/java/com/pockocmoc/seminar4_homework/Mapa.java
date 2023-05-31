package com.pockocmoc.seminar4_homework;

public class Mapa<K, V> {

    private final int SIZE = 16;
    private Node<K, V>[] nodes = new Node[SIZE];
    private int size = 0;

    public V put(K key, V value) {
        V result = null;
        Node<K, V> inputNode = new Node<>(key, value);
        int index = getIndex(key);
        if (nodes[index] == null) {
            nodes[index] = inputNode;
            size++;
        } else {
            Node<K, V> currentNode = nodes[index];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    result = currentNode.value;
                    currentNode.value = value;
                    return result;
                } else if (currentNode.nextnode == null) {
                    currentNode.nextnode = inputNode;
                    size++;
                    break;
                }
                currentNode = currentNode.nextnode;
            }
        }
        return result;
    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> currentNode = nodes[index];
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.nextnode;
        }
        return null;
    }

    public V remove(K key) {
        int index = getIndex(key);
        Node<K, V> currentNode = nodes[index];
        Node<K, V> prevNode = null;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                V result = currentNode.value;
                if (prevNode == null) {
                    nodes[index] = currentNode.nextnode;
                } else {
                    prevNode.nextnode = currentNode.nextnode;
                }
                size--;
                return result;
            }
            prevNode = currentNode;
            currentNode = currentNode.nextnode;
        }
        return null;
    }

    public void replace(K key, V value) {
        int index = getIndex(key);
        Node<K, V> currentNode = nodes[index];
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                currentNode.value = value;
                return;
            }
            currentNode = currentNode.nextnode;
        }
    }

    public int size() {
        return size;
    }

    public boolean containsKey(K key) {
        int index = getIndex(key);
        Node<K, V> currentNode = nodes[index];
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return true;
            }
            currentNode = currentNode.nextnode;
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (int i = 0; i < SIZE; i++) {
            Node<K, V> currentNode = nodes[i];
            while (currentNode != null) {
                if (currentNode.value.equals(value)) {
                    return true;
                }
                currentNode = currentNode.nextnode;
            }
        }
        return false;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }
}
