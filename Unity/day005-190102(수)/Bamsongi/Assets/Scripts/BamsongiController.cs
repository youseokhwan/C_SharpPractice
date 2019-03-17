using System.Collections;
using UnityEngine;

public class BamsongiController : MonoBehaviour {
    public void Shoot(Vector3 dir) {
        GetComponent<Rigidbody>().AddForce(dir);
    }

    private void OnCollisionEnter(Collision other) {
        GetComponent<Rigidbody>().isKinematic = true;
        GetComponent<ParticleSystem>().Play();
    }

    void Start() {

    }

    void Update() {
        
    }
}
