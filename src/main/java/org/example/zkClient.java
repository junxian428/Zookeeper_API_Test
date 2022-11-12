package org.example;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;

import java.io.IOException;

public class zkClient {

    private String connectString = "192.168.0.162:2181";
    private int sessionTimeout =2000;
    @Test
    public void init() throws IOException {
        ZooKeeper zkClient = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {

            }
        });
    }
}
