using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CarController : MonoBehaviour
{
    float speed = 10.0f;

    void Start() {
        Debug.Log("Car 생성!");
    }

    void Update() {
        // this.transform.Translate(0.1f, 0, 0);

        Vector3 dir = Vector3.zero;
        dir.x = Input.acceleration.x;

        Vector3 scale = transform.localScale;
        if(dir.x < 0) {
            scale.x = -Mathf.Abs(scale.x);
            transform.localScale = scale;
        }
        else {
            scale.x = Mathf.Abs(scale.x);
            transform.localScale = scale;
        }
        transform.Translate(dir * speed * Time.deltaTime);
        
        // 화면 밖으로 넘어가면 파괴
        if(this.transform.position.y < -7.0f) {
            Destroy(gameObject);
        }
    }

}
