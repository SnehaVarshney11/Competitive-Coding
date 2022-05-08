package Leetcode.MayDailyQues;

import java.util.ArrayList;
import java.util.List;

class NestedInteger{

    public boolean isInteger() {
        return false;
    }

    public Integer getInteger() {
        return null;
    }

    public NestedInteger[] getList() {
        return null;
    }}
class FlattenNestedListIterator {
    private List<Integer> list = new ArrayList<>();
    //private int index = 0;
    public void NestedIterator(List<NestedInteger> nestedList) {
        for (NestedInteger ni : nestedList) {
            flatten(ni);
        }
    }
    
    private void flatten(NestedInteger nested) {
        if (nested.isInteger()) 
            list.add(nested.getInteger());
        else 
            for (NestedInteger nestedFromList : nested.getList()) {
                flatten(nestedFromList);
        }
    }

    // @Override
    // public boolean hasNext() {
    //     return index < list.size();
    // }

    // @Override
    // public Integer next() {
    //     return list.get(index++);
    // }
}
