This project starts a Cassandra 3 instance at *localhost:9142*. It's not authenticated. It uses *cassandra-unit*, which is used in test cases.

It *works with JDK 1.8 only*, as cassandra-unit doesn't work with later versions of JDK.s

If you have Docker installed then you can use following command to run Cassandra 4. It opens 9042 port on host machine.

```
docker run --name some-cassandra -p 9042:9042 cassandra:4.1.1
```