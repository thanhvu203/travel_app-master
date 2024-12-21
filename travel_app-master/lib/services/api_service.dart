import 'dart:convert';
import 'package:http/http.dart' as http;

class ApiService {
  static Future<List<dynamic>> getAllPlace() async {
    final response = await http.get(Uri.parse('http://10.0.2.2:8080/api/places/getAllPlace'));

    if (response.statusCode == 200) {
      // Parse the JSON response and return the list of places
      return json.decode(response.body);
    } else {
      throw Exception('Failed to load places');
    }
  }
}
