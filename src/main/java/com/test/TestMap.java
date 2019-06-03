package com.test;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

    @Test
    public void test1(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("小强",88);
        map.put("111",2222);
        map.put("222",3333);

        System.out.println(map);

        Set<String> strings = map.keySet();
        System.out.println(strings);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);

    }



    HashMap map = new HashMap();

    Thread t1 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.put(new Integer(i), i);
            }
            System.out.println("t1 over");
        }
    };

    Thread t2 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.put(new Integer(i), i);
            }

            System.out.println("t2 over");
        }
    };

    Thread t3 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.put(new Integer(i), i);
            }

            System.out.println("t3 over");
        }
    };

    Thread t4 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.put(new Integer(i), i);
            }

            System.out.println("t4 over");
        }
    };

    Thread t5 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.put(new Integer(i), i);
            }

            System.out.println("t5 over");
        }
    };

    Thread t6 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.get(new Integer(i));
            }

            System.out.println("t6 over");
        }
    };

    Thread t7 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.get(new Integer(i));
            }

            System.out.println("t7 over");
        }
    };

    Thread t8 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.get(new Integer(i));
            }

            System.out.println("t8 over");
        }
    };

    Thread t9 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.get(new Integer(i));
            }

            System.out.println("t9 over");
        }
    };

    Thread t10 = new Thread() {
        public void run() {
            for (int i = 0; i < 50000; i++) {
                map.get(new Integer(i));
            }

            System.out.println("t10 over");
        }
    };


    @Test
    public void test2() {
        new TestMapByThread();

    }



}
