package angel.veitch;

import java.util.*;

public class Test {

    @org.junit.Test
    public void test(){
        LinkedList linkedList = new LinkedList();
        linkedList.add("12");
        linkedList.add("34");
        linkedList.add("45");

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
//            iterator.remove();
        }
//        Queue<IsochroneType> isochroneTypes = new PriorityQueue<>(4);
//        isochroneTypes.add(IsochroneType.EMERGENCY);
//        isochroneTypes.add(IsochroneType.SEVERE);
//        isochroneTypes.add(IsochroneType.URGENT);
//        isochroneTypes.add(IsochroneType.EXTREME);
//
//        while(true){
//            IsochroneType type = isochroneTypes.poll();
//            if (Objects.isNull(type)){
//                break;
//            }
//            System.out.println(type.name());
//        }

    }
}
