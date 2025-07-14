class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

head = None

def display(head):
    current = head 
    while current:
        print(current.data, end=" -> ")
        current = current.next
    print("None")


def insert_at_beginning(head, data):
    new_node = Node(data)
    new_node.next = head
    return new_node


def insert_at_end(head, data):
    new_node = Node(data)

    if head is None:
        return new_node
    
    current = head 

    while current.next:
        current = current.next
    
    current.next = new_node
    return head


def delete_by_value(head, key):
    if head is None:
        return None
    
    if head.data == key:
        return head.next
    
    currrent = head
    while currrent.next and currrent.next.data != key:
        currrent = currrent.next

    if currrent.next:
        currrent.next = currrent.next.next

    return head

def delete_by_position(head, pos):
    if not head:
        print("List is empty.")
        return head
    
    if pos == 0:
        return head.next
    
    current = head
    count = 0
    while current and count < pos - 1:
        current = current.next
        count += 1
    
    if current is None or current.next is None:
        print("Position out of range.")
        return head
    
    current.next = current.next.next
    return head

def search(head, key):
    current = head
    index = 0
    while current:
        if current.data == key:
            return index 
        current = current.next
        index += 1
    return -1

while True:
    print("\n----- Linked List Menu -----")
    print("1. Insert at Beginning")
    print("2. Insert at End")
    print("3. Delete by value")
    print("4. Delete by Position")
    print("5. Search")
    print("6. Display")
    print("7. Exit")

    choice = input("Enter your choice:")

    if choice == '1':
        data = int(input("Enter value to insert at beginning: "))
        head = insert_at_beginning(head, data)

    elif choice == '2':
        data = int(input("Enter value to insert at end: "))
        head = insert_at_end(head, data)

    elif choice == '3':
        key = int(input("Enter value to delete: "))
        head = delete_by_value(head, key)

    elif choice == '4':
        pos = int(input("Enter position to delete: "))
        head = delete_by_position(head, pos)

    elif choice == '5':
        key = int(input("Enter value to search: "))
        result = search(head, key)
        if result != -1:
            print("Value found at position", result)
        else:
            print("Value not found.")

    elif choice == '6':
        print("Current list: ", display(head))

    elif choice == '7':
        print("Exiting program, Goodbye!")
        break

    else:
        print("Invalid choice.")


