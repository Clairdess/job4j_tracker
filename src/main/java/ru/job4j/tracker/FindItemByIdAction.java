package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction {
    private final Output out;

    public FindItemByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item By Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by id ===");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
