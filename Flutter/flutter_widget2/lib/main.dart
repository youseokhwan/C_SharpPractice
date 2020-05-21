import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  // This widget is the home page of your application. It is stateful, meaning
  // that it has a State object (defined below) that contains fields that affect
  // how it looks.

  // This class is the configuration for the state. It holds the values (in this
  // case the title) provided by the parent (in this case the App widget) and
  // used by the build method of the State. Fields in a Widget subclass are
  // always marked "final".

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      // This call to setState tells the Flutter framework that something has
      // changed in this State, which causes it to rerun the build method below
      // so that the display can reflect the updated values. If we changed
      // _counter without calling setState(), then the build method would not be
      // called again, and so nothing would appear to happen.
      _counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
    // This method is rerun every time setState is called, for instance as done
    // by the _incrementCounter method above.
    //
    // The Flutter framework has been optimized to make rerunning build methods
    // fast, so that you can just rebuild anything that needs updating rather
    // than having to individually change instances of widgets.
    return Scaffold(
      appBar: AppBar(
        // Here we take the value from the MyHomePage object that was created by
        // the App.build method, and use it to set our appbar title.
        title: Text(widget.title),
      ),

      // 1. Center : 중앙 배치
//      body: Center(
//        child: Container(
//          color: Colors.red,
//          width: 100,
//          height: 100,
//        ),
//      ),

      // 2. Padding : 안쪽 여백
      // const를 사용하면 상수로 저장하여 메모리 절약
//      body: Padding(
//        padding: const EdgeInsets.all(40.0),
//        child: Container(
//          color: Colors.red,
//        ),
//      ),

      // 3. Align : 정렬
//      body: Align(
//        alignment: Alignment.bottomRight,
//        child: Container(
//          color: Colors.red,
//          width: 100,
//          height: 100,
//        ),
//      ),

      // 4. Expanded : 확장
      // flex로 비율 조정
//      body: Column(
//        children: <Widget>[
//          Expanded(
//            flex: 2,
//            child: Container(
//              color: Colors.red,
//            ),
//          ),
//          Expanded(
//            child: Container(
//              color: Colors.green,
//            ),
//          ),
//          Expanded(
//            child: Container(
//              color: Colors.blue,
//            ),
//          ),
//        ],
//      ),

      // 5. SizedBox : 특정 크기를 가지는 위젯
      // child 없이 사용하면 단순 여백
//      body: SizedBox(
//        width: 100,
//        height: 100,
//        child: Container(
//          color: Colors.red,
//        ),
//      ),

      // 6. Card : 카드 형태의 위젯
//      body: Center(
//        child: Card(
//          shape: RoundedRectangleBorder(
//            borderRadius: BorderRadius.circular(16.0),
//          ),
//          elevation: 4.0, // 그림자 깊이
//          child: Container(
//            width: 200,
//            height: 200,
//          ),
//        ),
//      ),

      // 7. RaisedButton
//      body: Center(
//        child: RaisedButton(
//          child: Text('RaisedButton'),
//          color: Colors.orange,
//          onPressed: () {},
//        ),
//      ),

      // 8. FlatButton
//      body: Center(
//        child: FlatButton(
//          child: Text('FlatButton'),
//          onPressed: () {},
//        ),
//      ),

      // 9. IconButton
//      body: Center(
//        child: IconButton(
//          icon: Icon(Icons.add),
//          color: Colors.red,
//          iconSize: 100.0,
//          onPressed: () {},
//        ),
//      ),

      // 10. FloatingActionButton
//      body: Center(
//        child: FloatingActionButton(
//          child: Icon(Icons.add),
//          onPressed: () {},
//        ),
//      ),

      // 11. Text
//      body: Center(
//        child: Text(
//          'Hello World',
//          style: TextStyle(
//            fontSize: 40.0,
//            fontStyle: FontStyle.italic,
//            fontWeight: FontWeight.bold,
//            color: Colors.red,
//            letterSpacing: 4.0,
//          ),
//        ),
//      ),

      // 12. Image : 네트워크에 있는 이미지를 URL만 간단하게 작성
//      body: Center(
//        child: Image.network('http://bit.ly/2Pvz4t8'),
//      ),

      // 13. Progress
      // 일반적으로 화면 위에 겹쳐서 사용하므로 Stack 위에서 사용
//      body: Column(
//        children: <Widget>[
//          CircularProgressIndicator(),
//          LinearProgressIndicator(),
//        ],
//      ),

      // 14. CircleAvatar
      body: Center(
        child: CircleAvatar(
          child: Icon(Icons.person),
        ),
      ),

    );
  }
}
