package deqo.mpon.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack {
    ArrayList<Item> items = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override
    public int getSize() {
        return this.items.size();
    }

    @Override
    public void push(Item item) {
        this.items.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return this.items.get(this.getSize());
    }

    @Override
    public Item pop() throws EmptyStackException {
        return this.items.remove(0);
    }
}
