package ru.job4j.tracker;

public class EditItemAction implements UserAction {
    private final Output out;

    public EditItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Заявка изменена успешно.");
        } else {
            out.println("Ошибка замены заявки.");
        }
        return true;
    }
}
