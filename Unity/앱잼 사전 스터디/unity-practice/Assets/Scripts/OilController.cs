using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class OilController : MonoBehaviour
{
    void Start()
    {
        int x = Random.Range(6, 61);
        this.transform.position = new Vector3(x, 5.0f, 0);
    }

    void Update()
    {
        
    }

    void OnCollisionEnter2D(Collision2D col) {
        if(col.gameObject.tag == "Player") {
            Debug.Log("충돌함");
            Destroy(gameObject);
        }
    }
}
