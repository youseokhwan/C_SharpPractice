//
//  ViewController.swift
//  PageControl
//
//  Created by 유석환 on 2020/01/11.
//  Copyright © 2020 ysh. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    var images = [ "01.png", "02.png", "03.png", "04.png", "05.png", "06.png" ]
    
    @IBOutlet var imgView: UIImageView!
    @IBOutlet var pageControl: UIPageControl!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        pageControl.numberOfPages = images.count
        pageControl.currentPage = 0
        pageControl.pageIndicatorTintColor = UIColor.green
        pageControl.currentPageIndicatorTintColor = UIColor.red
        imgView.image = UIImage(named: images[0])
    }

    @IBAction func pageChange(_ sender: UIPageControl) {
        imgView.image = UIImage(named: images[pageControl.currentPage])
    }
}
