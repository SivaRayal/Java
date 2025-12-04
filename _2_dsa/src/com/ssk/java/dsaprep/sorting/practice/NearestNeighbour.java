package com.ssk.java.dsaprep.sorting.practice;

/*
    Nearest Neighbors
		Given coordinates of a point p and n other points on a two-dimensional surface, find k points out of n which are the nearest to point p.
		Distance is measured by the standard Euclidean method.

		Example One
			{
			"p_x": 1,
			"p_y": 1,
			"k": 1,
			"n_points": [
			[0, 0],
			[1, 0]
			]
			}
			Output:
			[
			[1, 0]
			]
			The distance of point {0, 0} from point p{1, 1} is sqrt(2) and that of point {1, 0} is 1. We need to choose 1(k) point having the minimum distance from point p. So it is {1, 0}.

		Example Two
			{
			"p_x": 1,
			"p_y": 1,
			"k": 2,
			"n_points": [
			[1, 0],
			[2, 1],
			[0, 1]
			]
			}
			Output:
			[
			[1, 0],
			[2, 1]
			]
			We can see that there are all the points are at the same distance from point p. So the answer can be any 2 points. Here {{1, 0}, {0, 1}} and {{2, 1}, {0, 1}} are all equally acceptable answers.

		Constraints:
			1 <= n <= 100000
			k <= n
			-1000000000 <= coordinates of points <=1000000000
*/

import java.util.*;

public class NearestNeighbour {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> out=new ArrayList<ArrayList<Integer>>();
       // nearest_neighbours();
    }


    static class Point {
        int x;
        int y;
        double dist;

        public Point(int x, int y, double dist){
            this.x = x;
            this.y = y;
            this.dist= dist;
        }
    }

    static ArrayList<ArrayList<Integer>> nearest_neighbours(Integer p_x, Integer p_y, Integer k, ArrayList<ArrayList<Integer>> n_points) {
        if (n_points.size() <= k) return n_points;

        // //create the comparator
        Comparator<Point> distanceComparator = new Comparator<>() {
            @Override
            public int compare(Point a, Point b) {
                if(b.dist < a.dist) return -1;
                if(b.dist > a.dist) return 1;
                else return 0;
            }
        };
        // Create a maxheap
        Queue<Point> pq = new PriorityQueue<Point>(distanceComparator);

        // Queue<Point> pq = new PriorityQueue<Point>((a,b) -> Double.compare(a.dist, b.dist));

        List<Point> points = new ArrayList<Point>();
        //create point objects for all the points in the list
        for(ArrayList<Integer> point: n_points) {
            Point p =  new Point(point.get(0), point.get(1), getDistance(p_x, p_y, point.get(0), point.get(1)));
            if(pq.size() < k) {
                pq.offer(p);
            }
            else if (p.dist < pq.peek().dist){
                pq.poll();
                pq.offer(p);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while(!pq.isEmpty()) {
            Point pt = pq.peek();
            ArrayList<Integer> subList = new ArrayList<>();
            subList.add(pt.x);
            subList.add(pt.y);
            result.add(subList);
            pq.poll();
        }
        return result;
    }

    static double getDistance(int nx, int ny, int x, int y) {
        return Math.sqrt(Math.pow(nx - x, 2) + Math.pow(ny - y, 2));
    }

}
