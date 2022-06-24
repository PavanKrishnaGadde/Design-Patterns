package com.behavioural.observer;

public class ObserverMain {
    public static void main(String args[]) {

        Channel ch1 = new Channel("java");
        Channel ch2 = new Channel("javascript");
        Channel ch3 = new Channel("python");

        Subscriber sub1 = new Subscriber("pavan");
        Subscriber sub2 = new Subscriber("krishna");
        Subscriber sub3 = new Subscriber("kumar");
        Subscriber sub4 = new Subscriber("khan");
        Subscriber sub5 = new Subscriber("kaur");
        Subscriber sub6 = new Subscriber("kaul");

        Publisher pub = new Publisher("gadde");
        Publisher pub2 = new Publisher("gandhi");

        ch1.subscribe(sub1);
        ch1.subscribe(sub2);
        ch1.subscribe(sub4);
        ch2.subscribe(sub3);
        ch2.subscribe(sub5);
        ch3.subscribe(sub6);
        ch2.subscribe(sub6);
        ch2.subscribe(sub1);

        ch1.publish(pub, "Introduction to Java");
        ch2.publish(pub2, "Demystifying JavaScript");
        ch3.publish(pub, "Basics of Python");

        ch2.unsubscribe(sub3);
        ch2.publish(pub2, "JavaScript Essentials");

    }
}
