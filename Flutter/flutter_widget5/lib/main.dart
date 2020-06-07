import 'package:flutter/material.dart';
import 'dart:math';

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
//      home: HeroPage(), // 1
//      home: AnimatedContainerPage(), // 2
      home: SilverPage(),
    );
  }
}

// 첫 번째 페이지
class HeroPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Hero'),
      ),
      body: Center(
        child: GestureDetector(
          onTap: () {
            Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => HeroDetailPage()),
            );
          },
          child: Hero(
            tag: 'image', // 두 번째 페이지의 태그와 동일해야 함
            child: Image.asset(
              'assets/sample.jpg',
              width: 100,
              height: 100,
            ),
          ),
        ),
      ),
    );
  }
}

// 두 번째 페이지
class HeroDetailPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Hero Detail'),
      ),
      body: Hero(
        tag: 'image', // 첫 번째 태그와 동일해야 함
        child: Image.asset('assets/sample.jpg'),
      ),
    );
  }
}

// AnimatedContainerPage
class AnimatedContainerPage extends StatefulWidget {
  @override
  _AnimatedContainerPageState createState() => _AnimatedContainerPageState();
}

// AnimatedContainer
class _AnimatedContainerPageState extends State<AnimatedContainerPage> {
  var _size = 100.0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('AnimatedContainer'),
      ),
      body: Center(
        child: GestureDetector(
          onTap: () {
            final random = Random();
            setState(() {
              // 클릭할 때마다 100.0~299.0 사이의 실수를 랜덤하게 얻기
              _size = random.nextInt(200).toDouble() + 100;
            });
          },
          child: AnimatedContainer(
            duration: Duration(seconds: 1),
            width: _size,
            height: _size,
            child: Image.asset('assets/sample.jpg'),
            curve: Curves.fastOutSlowIn,
          ),
        )
      ),
    );
  }
}

// SilverAppBar
class SilverPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: CustomScrollView(
        slivers: <Widget>[
          SliverAppBar(
            pinned: true,
            expandedHeight: 180.0,
            flexibleSpace: FlexibleSpaceBar(
              title: Text('Silver'),
              background: Image.asset(
                'assets/sample.jpg',
                fit: BoxFit.cover,
              ),
            ),
          ),
          SliverFillRemaining(
            child: Center(
              child: Text('center'),
            )
          ),
        ],
      ),
    );
  }
}