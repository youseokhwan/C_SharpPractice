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
  DateTime _selectedTime;
  String _selectedTime2;

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
      body: ListView(

        // 1. AlertDialog
        children: <Widget>[
          ListTile(
            title: Text('AlertDialog'),
            onTap: () {
              showDialog(
                context: context,
                barrierDismissible: false, // 사용자가 다이얼로그 바깥을 터치하면 닫히지 않음
                builder: (BuildContext context) {
                  return AlertDialog(
                    title: Text('제목'),
                    content: SingleChildScrollView(
                      child: ListBody(
                        children: <Widget>[
                          Text('Alert Dialog입니다.'),
                          Text('OK를 눌러 닫습니다.'),
                        ],
                      ),
                    ),
                    actions: <Widget>[
                      FlatButton(
                        child: Text('OK'),
                        onPressed: () {
                          // 다이얼로그 닫기
                          Navigator.of(context).pop();
                        },
                      ),
                      FlatButton(
                        child: Text('Cancel'),
                        onPressed: () {
                          // 다이얼로그 닫기
                          Navigator.of(context).pop();
                        },
                      ),
                    ],
                  );
                }
              );
            },
          ),

          // 2. DatePicker
          ListTile(
            title: Text('DatePicker'),
            onTap: () {
              Future<DateTime> selectedDate = showDatePicker(
                context: context,
                initialDate: DateTime.now(), // 초깃값
                firstDate: DateTime(2018),  // 시작일 2018년 1월 1일
                lastDate: DateTime(2030),  // 마지막일 2030년 1월 1일
                builder: (BuildContext context, Widget child) {
                  return Theme(
                    data: ThemeData.dark(),  // 다크 테마
                    child: child,
                  );
                }
              );
              selectedDate.then((dataTime) {
                setState(() {
                  _selectedTime = dataTime;
                });
              });
            },
          ),
          Text('$_selectedTime'),

          // 3. TimePicker
          ListTile(
            title: Text('TimePicker'),
            onTap: () {
              Future<TimeOfDay> selectedTime2 = showTimePicker(
                initialTime: TimeOfDay.now(),
                context: context,
              );
              selectedTime2.then((timeOfDay) {
                setState(() {
                  _selectedTime2 = '${timeOfDay.hour}:${timeOfDay.minute}';
                });
              });
            },
          ),
          Text('$_selectedTime2'),

          // 4. GestureDetector
          // GestureDetector와 InkWell은 이벤트 프로퍼티가 없는 위젯에 이벤트를 적용
          GestureDetector(
            onTap: () {
              print('GestureDetector 클릭!!');
            },
            child: Text('클릭 Me!!'),
          ),
          SizedBox(
            height: 40
          ),

          // 5. InkWell
          // InkWell은 물결 효과 포함
          InkWell(
            onTap: () {
              print('InkWell 클릭!!');
            },
            child: Text('클릭 Me!!'),
          ),
        ],
      )
    );
  }
}
