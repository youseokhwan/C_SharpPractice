﻿using System.Collections;
using UnityEngine;
using UnityEngine.SceneManagement;

public class ClearDirector : MonoBehaviour
{
    void Start() {
        
    }

    void Update() {
        if(Input.GetMouseButtonDown(0)) {
            SceneManager.LoadScene("GameScene");
        }
    }
}
