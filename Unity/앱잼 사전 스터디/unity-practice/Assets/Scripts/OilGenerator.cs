using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class OilGenerator : MonoBehaviour
{
    public GameObject oilPrefab;
    float span = 2.0f;
    float delta = 0;

    void Update()
    {
        this.delta += Time.deltaTime;
        if(this.delta > this.span) {
            this.delta = 0;
            GameObject go = Instantiate(oilPrefab) as GameObject;
        }
    }
}
