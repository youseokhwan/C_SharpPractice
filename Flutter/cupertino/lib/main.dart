import 'package:flutter/cupertino.dart';
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
  var _isOn = false;

  @override
  Widget build(BuildContext context) {
    // This method is rerun every time setState is called, for instance as done
    // by the _incrementCounter method above.
    //
    // The Flutter framework has been optimized to make rerunning build methods
    // fast, so that you can just rebuild anything that needs updating rather
    // than having to individually change instances of widgets.
    return Scaffold(
      appBar: CupertinoNavigationBar( // 머터리얼의 AppBar에 대응
          middle: Text('4.10 쿠퍼티노 디자인'), // 머터리얼 AppBar의 title에 대응
      ),
      body: Column(
        children: <Widget>[
          CupertinoSwitch(
            value: _isOn,
            onChanged: (bool value) {
              setState(() {
                _isOn = value;
              });
            },
          ),
          CupertinoButton( // Switch에 대응
            borderRadius: BorderRadius.circular(16.0),
            color: Colors.orange,
            child: Text('쿠퍼티노 AlertDiaglog'),
            onPressed: () {
              _showCupertinoDialog();
            },
          ),
          CupertinoButton( // RaisedButton에 대
            child: Text('쿠퍼티노 Picker'),
            onPressed: () {
              _showCupertinoPicker();
            },
          ),
        ],
      ),
    );
  }

  _showCupertinoDialog() {
    showDialog(
      context: context,
      builder: (context) => CupertinoAlertDialog(
        title: Text('제목'),
        content: Text('내용'),
        actions: <Widget>[
          CupertinoDialogAction(
            child: Text('Cancel'),
          ),
          CupertinoDialogAction(
            child: Text('Ok'),
            onPressed: () {
              Navigator.of(context).pop(); // 다이얼로그 닫기
            },
          )
        ],
      )
    );
  }

  _showCupertinoPicker() async {
    // 0부터 9까지의 숫자 리스트 생성
    final _items = List.generate(10, (i) => i);
    var result = _items[0]; // 기본값 0

    await showCupertinoModalPopup(
      context: context,
      builder: (context) => Container(
        height: 200.0, // 피커의 높이는 200
        child: CupertinoPicker(
          children: _items.map((e) => Text('No. $e')).toList(), // 0부터 9까지의 숫자 표시
          itemExtent: 50.0, // 항목 1개의 높이는 50
          onSelectedItemChanged: (int value) {
            result = _items[value];
          },
        ),
      ),
    );

    print(result);
  }
}
