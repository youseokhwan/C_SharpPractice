using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraController : MonoBehaviour
{
    public GameObject car;

    void Start()
    {
        
    }

    void Update()
    {
        this.transform.position = new Vector3(car.transform.position.x+5.5f, this.transform.position.y, this.transform.position.z);
    }
}
