#!/usr/bin/env groovy

/**
 * Send a slack notifications if the build status has changed
 */
def call(boolean buildStandalone)
{
	echo "### Inside boolean function"
	List channels = ['elem1']
	if (buildStandalone) {
		channels += 'elem2'
	}
}

def call()
{
	echo "### Inside default function"
	call(false)
}

def call(List channels)
{
	echo "### Inside channel function $channels"
}
