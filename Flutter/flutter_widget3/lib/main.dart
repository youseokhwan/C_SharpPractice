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

enum Gender { MAN, WOMAN }

class _MyHomePageState extends State<MyHomePage> {
  var isChecked1 = false;
  var isChecked2 = false;
  Gender _gender = Gender.MAN;
  final _valueList = ['First', 'Second', 'Third'];
  var _selectedValue = 'First';

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
      body: SingleChildScrollView(
        child: ListBody(
          children: <Widget>[
            // 1. TextField
            TextField(),
            TextField(
              decoration: InputDecoration(
                labelText: '여기에 입력하세요',  // 힌트
              ),
            ),
            TextField(
              decoration: InputDecoration(
                border: OutlineInputBorder(),  // 외곽선
                labelText: '여기에 입력하세요',
              ),
            ),

            // 2. CheckBox
            Checkbox(
              value: isChecked1,
              onChanged: (value) {
                setState(() {
                  isChecked1 = value;
                });
              },
            ),

            // 3. Switch
            Switch(
              value: isChecked2,
              onChanged: (value) {
                setState(() {
                  isChecked2 = value;
                });
              },
            ),

            // 4. Radio, RadioListTile
            // RadioListTile의 경우 버튼 오른쪽 텍스트와 여백도 클릭 영역
            ListTile(
              title: Text('남자'),
              leading: Radio(
                value: Gender.MAN,
                groupValue: _gender,
                onChanged: (value) {
                  setState(() {
                    _gender = value;
                  });
                },
              ),
            ),
            ListTile(
              title: Text('여자'),
              leading: Radio(
                value: Gender.WOMAN,
                groupValue: _gender,
                onChanged: (value) {
                  setState(() {
                    _gender = value;
                  });
                },
              ),
            ),

            // 5. DropDownButton
            DropdownButton(
              value: _selectedValue,
              items: _valueList.map(
                  (value) {
                    return DropdownMenuItem(
                      value: value,
                      child: Text(value),
                    );
                  },
              ).toList(),
              onChanged: (value) {
                setState(() {
                  _selectedValue = value;
                });
              },
            )
          ],
        ),
      ),
    );
  }
}
