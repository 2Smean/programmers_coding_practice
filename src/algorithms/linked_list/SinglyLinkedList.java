package algorithms.linked_list;

// 템플릿으로 만든 자바용 단일 연결 리스트
public class SinglyLinkedList {

    public class ListElement<T> {

        private ListElement<T> next;
        private T data;

        public ListElement(T value) {
            data = value;
        }

        public ListElement<T> next() {
            return next;
        }

        public T value() {
            return data;
        }

        public void setNext(ListElement<T> elem) {
            next = elem;
        }

        public void setValue(T value) {
            data = value;
        }
    }
}
