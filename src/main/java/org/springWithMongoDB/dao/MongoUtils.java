package org.springWithMongoDB.dao;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoUtils {

	// Extra helper code

	public static BasicDBObject[] createSeedData() {

		BasicDBObject seventies = new BasicDBObject();
		seventies.put("decade", "1970s");
		seventies.put("artist", "Debby Boone");
		seventies.put("song", "You Light Up My Life");
		seventies.put("weeksAtOne", 10);

		BasicDBObject eighties = new BasicDBObject();
		eighties.put("decade", "1980s");
		eighties.put("artist", "Olivia Newton-John");
		eighties.put("song", "Physical");
		eighties.put("weeksAtOne", 10);

		BasicDBObject nineties = new BasicDBObject();
		nineties.put("decade", "1990s");
		nineties.put("artist", "Mariah Carey");
		nineties.put("song", "One Sweet Day");
		nineties.put("weeksAtOne", 16);

		final BasicDBObject[] seedData = { seventies, eighties, nineties };

		return seedData;
	}

	String uri = "mongo ds061258.mongolab.com:61258/mogodb_qiotec_ranjan -u ranjan_qiotec -p gabbar15";
	static String user = "ranjan_qiotec";
	static String password = "gabbar15";
	static String dbName = "mogodb_qiotec_ranjan";
	static String server = "ds061258.mongolab.com";
	static String port = "61258";

	public static void main33(String[] args) throws UnknownHostException {

		// Create seed data

		final BasicDBObject[] seedData = createSeedData();

		// Standard URI format: mongodb://[dbuser:dbpassword@]host:port/dbname
		String urii = "mongodb://" + user + ":" + password + "@" + server + ":"
				+ port + "/" + dbName;
		System.out.println(urii);
		MongoClientURI uri = new MongoClientURI(urii);
		MongoClient client = new MongoClient(uri);
		DB db = client.getDB(uri.getDatabase());

		/*
		 * First we'll add a few songs. Nothing is required to create the songs
		 * collection; it is created automatically when we insert.
		 */
		db.createCollection("songs", null);
		DBCollection songs = db.getCollection("songs");

		// Note that the insert method can take either an array or a document.

		songs.insert(seedData);

		/*
		 * Then we need to give Boyz II Men credit for their contribution to the
		 * hit "One Sweet Day".
		 */

		BasicDBObject updateQuery = new BasicDBObject("song", "One Sweet Day");
		songs.update(updateQuery, new BasicDBObject("$set", new BasicDBObject(
				"artist", "Mariah Carey ft. Boyz II Men")));

		/*
		 * Finally we run a query which returns all the hits that spent 10 or
		 * more weeks at number 1.
		 */

		BasicDBObject findQuery = new BasicDBObject("weeksAtOne",
				new BasicDBObject("$gte", 10));
		BasicDBObject orderBy = new BasicDBObject("decade", 1);

		DBCursor docs = songs.find(findQuery).sort(orderBy);

		while (docs.hasNext()) {
			DBObject doc = docs.next();
			System.out.println("In the " + doc.get("decade") + ", "
					+ doc.get("song") + " by " + doc.get("artist")
					+ " topped the charts for " + doc.get("weeksAtOne")
					+ " straight weeks.");
		}

		// Since this is an example, we'll clean up after ourselves.

		songs.drop();

		// Only close the connection when your app is terminating

		client.close();
	}

	public static String main2(String args[]) {
		try {
			/*
			 * MongoClient mongoClient = new MongoClient
			 * ("ds059821.mongolab.com" , 59821); DB db2 = mongoClient.getDB(
			 * "CloudFoundry_rbkn3lar_9dcvr74s" ); boolean auth = db2.
			 * authenticate("ranjan_b" , "gabbar15".toCharArray ()); MongoClient
			 * mongo = new MongoClient(
			 * "mongodb://ranjan_b:gabbar15@ds059821.mongolab.com:59821/CloudFoundry_rbkn3lar_9dcvr74s"
			 * );
			 */
			// ("ds059821.mongolab.com",
			// 59821);
			/*
			 * UserCredentials credentials = new UserCredentials("ranjan_b",
			 * "gabbar@15");
			 */
			/*
			 * String collectionName = "employeeCollection"; DB db =
			 * MongoDbUtils .getDB(mongo, "CloudFoundry_rbkn3lar_9dcvr74s" );
			 */
			String urii = "mongodb://" + user + ":" + password + "@" + server
					+ ":" + port + "/" + dbName;
			MongoClientURI uri = new MongoClientURI(urii);
			MongoClient client = new MongoClient(uri);
			DB db = client.getDB(uri.getDatabase());
			String collectionName = "employeeCollection";

			if (!db.collectionExists(collectionName)) {
				db.createCollection(collectionName, null);
			}
			DBCollection coll = db.getCollection(collectionName);
			BasicDBObject doc = new BasicDBObject("name", "MongoDB"
					+ (int) (Math.random() * 1000))
					.append("type", "database")
					.append("count", 1)
					.append("info",
							new BasicDBObject("x", 203).append("y", 102));
			coll.insert(doc);
			DBCursor cur = coll.find();
			StringBuffer buffer = new StringBuffer();
			while (cur.hasNext()) {
				buffer.append(cur.next().toString() + "<br/>");
			}
			System.out.println(buffer.toString());
			return buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "BLANK";
	}

	public static void main(String args[]) {
		main2(args);
	}
}
