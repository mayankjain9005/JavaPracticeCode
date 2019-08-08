/*package com.db;

public class mongoClient {


//1. The database for reactive, real-time applications
MongoClient mongoClient;

//Create a new MongoClient with a MongoDB URI string.
if (args.length == 0) {
//Defaults to a localhost replicaset on ports: 27017, 27018, 27019
mongoClient = new MongoClient(new
MongoClientURI("mongodb://localhost:27017,localhost:27018,localhost:27019"));
} else {
mongoClient = new MongoClient(new MongoClientURI(args[0]));
}

//Select the MongoDB database.
MongoDatabase database = mongoClient.getDatabase("testChangeStreams");

//Select the collection to query.
MongoCollection<Document> collection = database.getCollection("documents");

//Create the change stream cursor.
MongoCursor<Document> cursor = collection.watch().iterator();

}*/